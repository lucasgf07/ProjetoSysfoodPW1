package ifpb.modelo;

import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class Estabelecimento {

    private String nome;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private int numeroEndereco;
    private String tipo;
    private String diasFuncionamento;
    private String horarioFuncionamento;
    private String fone;
    private Refeicao[] refeicao;

    public Estabelecimento(String nome, String rua, String cidade, 
            String estado, String cep, int numeroEndereco, String tipo, 
            String diasFuncionamento, String horarioFuncionamento, String fone){
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numeroEndereco = numeroEndereco;
        this.tipo = tipo;
        this.diasFuncionamento = diasFuncionamento;
        this.horarioFuncionamento = horarioFuncionamento;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDiasFuncionamento() {
        return diasFuncionamento;
    }

    public void setDiasFuncionamento(String diasFuncionamento) {
        this.diasFuncionamento = diasFuncionamento;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.rua);
        hash = 59 * hash + Objects.hashCode(this.cidade);
        hash = 59 * hash + Objects.hashCode(this.estado);
        hash = 59 * hash + Objects.hashCode(this.cep);
        hash = 59 * hash + this.numeroEndereco;
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.diasFuncionamento);
        hash = 59 * hash + Objects.hashCode(this.horarioFuncionamento);
        hash = 59 * hash + Objects.hashCode(this.fone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estabelecimento other = (Estabelecimento) obj;
        if (this.numeroEndereco != other.numeroEndereco) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.diasFuncionamento, other.diasFuncionamento)) {
            return false;
        }
        if (!Objects.equals(this.horarioFuncionamento, other.horarioFuncionamento)) {
            return false;
        }
        if (!Objects.equals(this.fone, other.fone)) {
            return false;
        }
        return true;
    }
    
     
     
    
}
