package Projetos.ProjetoLivro;

public class Livro implements Publicacao {

    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Método Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    // Métodos
    public String detalhes() {
        return "Livro{" +
                "\ntitulo = " + titulo +
                "\nautor = " + autor +
                "\ntotPaginas = " + totPaginas + ", pagAtual = " + pagAtual +
                "\naberto = " + aberto +
                "\nleitor = " + leitor.getNome() + ", idade = " + leitor.getIdade() + ", sexo = " + leitor.getSexo() +
                "\n" +
                '}';
    }

    // Métodos Getter e Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pagina;
        }
    }

    @Override
    public void avancarPag() {
        if (this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (this.pagAtual > 0) {
        this.pagAtual--;
        }
    }
}
