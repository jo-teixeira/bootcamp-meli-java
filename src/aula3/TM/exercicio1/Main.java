package bootcamp.exercicio1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sort de Pessoas");
        Pessoa p1 = new Pessoa("Israel", "105.841.203-03");
        Pessoa p2 = new Pessoa("Caique", "17584230503");
        Pessoa p3 = new Pessoa("Paulo", "17684230503");
        Pessoa p4 = new Pessoa("João", "16984230503");
        Pessoa p5 = new Pessoa("Gabriel", "16884230503");
        Pessoa[] pessoas = new Pessoa[]{p1, p2, p3, p4, p5};
        pessoas = SortUtil.sort(pessoas);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getCpf());
        }
        System.out.println("\n");
        System.out.println("Sort de Celulares");
        Celular c1 = new Celular(89231234L);
        Celular c2  = new Celular(93940293L);
        Celular c3 = new Celular(82268780L);
        Celular c4 = new Celular(93929990L);
        Celular c5  = new Celular(89899192L);
        Celular[] celulares = new Celular[]{c1, c2, c3, c4, c5};
        celulares = SortUtil.sort(celulares);
        for (Celular celular : celulares) {
            System.out.println(celular.getNumero());
        }
    }
}
