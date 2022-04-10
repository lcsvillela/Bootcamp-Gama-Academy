package Exerc2;

public class Main {

	public static String situacaoDoAluno(int situacao) {
		String situacaoDoAluno = "";

		if (situacao >= 0) {
			situacaoDoAluno = "Aprovado!";
		} else {
			situacaoDoAluno = "Reprovado!";
		}
		return situacaoDoAluno;
	}

	public static void main(String[] args) {
		Aluno aluno = new Aluno(125, "Emanuel da Fonseca", 6, 6, 9);
		Aluno aluno2 = new Aluno(126, "Carlos Almeida", 5, 6, 8);
		String situacao = "";
		
		aluno.calcularMedia();
		situacao = situacaoDoAluno(aluno.recuperacao());
		System.out.println();
		System.out.println("\tMatrícula do Aluno:   " + aluno.getMatricula());
		System.out.println("\tNome do Aluno:        " + aluno.getNome());
		System.out.println("\tMédia do Aluno:       " + aluno.getMediaPonderada());
		System.out.println("\tSituação do Aluno:    " + situacao);

		System.out.println("\t-----------------------------------------");

		aluno2.calcularMedia();
		situacao = situacaoDoAluno(aluno2.recuperacao());
		System.out.println("\tMatrícula do Aluno:   " + aluno2.getMatricula());
		System.out.println("\tNome do Aluno:        " + aluno2.getNome());
		System.out.println("\tMédia do Aluno:       " + aluno2.getMediaPonderada());
		System.out.println("\tSituação do Aluno:    " + situacao);

	}
}