package br.unicesumar;

public class Principal {

    public static void main(String[] args) {
        try {
            Pessoa edson = new Pessoa("11111", "Edson");
            Pessoa vini = new Pessoa("22222", "Vini");

            ControlePessoas controlePessoas = new ControlePessoas();
            controlePessoas.inserirPessoa(edson);
            controlePessoas.inserirPessoa(vini);

            System.out.println(controlePessoas.exibirTodos());

            Pessoa pessoa = controlePessoas.consultarPessoasPorNome("vini");
            System.out.println("pessoa encontrada: " + pessoa);

            Pessoa edsonNovo = new Pessoa("00000","Edson Lessa");
            Pessoa pessoaAlterada = controlePessoas.alterarPessoa("Edson", edsonNovo);
            System.out.println("Pessoa alterada: " + pessoaAlterada);
            System.out.println(controlePessoas.exibirTodos());

            controlePessoas.deletar(pessoaAlterada);
            System.out.println(controlePessoas.exibirTodos());
            controlePessoas.deletar("Vini");
            System.out.println(controlePessoas.exibirTodos());

        } catch (PessoaException e) {
            System.out.println(e.getMessage());
        }

    }
}
