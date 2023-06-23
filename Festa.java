abstract class FestaAniversario {
    private String nomeAniversariante;
    private int idadeAniversariante;
    private String local;
    private String data;
    private int quantidadeConvidados;
    private boolean temDecoração;
    private double orcamento;

    public FestaAniversario(String nomeAniversariante, int idadeAniversariante, String local, String data, int quantidadeConvidados, boolean temDecoração, double orcamento) {
        this.nomeAniversariante = nomeAniversariante;
        this.idadeAniversariante = idadeAniversariante;
        this.local = local;
        this.data = data;
        this.quantidadeConvidados = quantidadeConvidados;
        this.temDecoração = temDecoração;
        this.orcamento = orcamento;
    }


    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public int getIdadeAniversariante() {
        return idadeAniversariante;
    }

    public void setIdadeAniversariante(int idadeAniversariante) {
        this.idadeAniversariante = idadeAniversariante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantidadeConvidados() {
        return quantidadeConvidados;
    }

    public void setQuantidadeConvidados(int quantidadeConvidados) {
        this.quantidadeConvidados = quantidadeConvidados;
    }

    public boolean isTemDecoração() {
        return temDecoração;
    }

    public void setTemDecoração(boolean temDecoração) {
        this.temDecoração = temDecoração;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public abstract void prepararFesta();
}

public class MinhaFestaAniversario extends FestaAniversario {
    // Construtor
    public MinhaFestaAniversario(String nomeAniversariante, int idadeAniversariante, String local, String data, int quantidadeConvidados, boolean temDecoração, double orcamento) {
        super(nomeAniversariante, idadeAniversariante, local, data, quantidadeConvidados, temDecoração, orcamento);
    }

    @Override
    public void prepararFesta() {
        System.out.println("Preparando a festa de aniversário para " + getNomeAniversariante() + " de " + getIdadeAniversariante() + " anos...");
    }

    public static void main(String[] args) {
        MinhaFestaAniversario festa = new MinhaFestaAniversario("Carlos", 40, "Salão de Festas", "15/08/2023", 100, true, 5000.0);

    }
}