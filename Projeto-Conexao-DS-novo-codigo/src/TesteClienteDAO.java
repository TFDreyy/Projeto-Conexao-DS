import java.util.List;

import dao.ClienteDAO;
import model.Cliente;

public class TesteClienteDAO {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Maria Silva");
        cliente.setNomeSocial("Maria");
        cliente.setCpf("123.456.789-00");
        cliente.setGenero("Feminino");
        cliente.setAfrodescendente(false);
        cliente.setEscolaridadePublica(true);
        cliente.setDataNascimento("2006-04-15");
        cliente.setLocalNascimento("Guarulhos");
        cliente.setNacionalidade("Brasileira");
        cliente.setPaisOrigem("Brasil");
        cliente.setFiliacao1("Ana Silva");
        cliente.setFiliacao2("Carlos Silva");
        cliente.setResponsavelLegal("Ana Silva");
        cliente.setGrauParentesco("Mae");
        cliente.setHabilitacao("Desenvolvimento de Sistemas");
        cliente.setPeriodo("Manha");
        cliente.setSerieModulo("1 modulo");
        cliente.setRuaAvenida("Rua das Flores");
        cliente.setBairro("Centro");
        cliente.setComplemento("Casa");
        cliente.setApto("");
        cliente.setBloco("");
        cliente.setCep("07000-000");
        cliente.setCidade("Guarulhos");
        cliente.setTelefone("(11) 2222-3333");
        cliente.setCelular("(11) 99999-0000");
        cliente.setEmail("maria.silva@email.com");
        cliente.setEstudaAtualmenteEtec(false);
        cliente.setEstudaOutraEtec(false);
        cliente.setJaEstudouEtec(false);
        cliente.setConcluiuEnsinoMedio(false);
        cliente.setEscolaEnsinoMedio("E.E. Exemplo");

        ClienteDAO dao = new ClienteDAO();
        dao.salvar(cliente);
        System.out.println("Cliente salvo com id: " + cliente.getId());

        List<Cliente> clientes = dao.listar();

        for (Cliente c : clientes) {
            System.out.println(c.getId() + " - " + c.getNome() + " - " + c.getEmail());
        }
    }
}
