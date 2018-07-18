package ifpb.modelo;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class Usuario {

    private String nome;
    private String email;
    private String profissao;
    private char sexo;
    private String imagem;
    private String[] comentario;
    private String rua;
    private String cidade;
    private String estado;
    private int numeroEndereco;
    private String cep;
    private String descricao;
    private String telefone;

    public Usuario(String nome, String email, String profissao, char sexo, 
           String imagem, String[] comentario, String rua, String cidade, 
           String estado, int numeroEndereco, String cep, String descricao, 
           String telefone) {
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;
        this.sexo = sexo;
        this.imagem = imagem;
        this.comentario = comentario;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numeroEndereco = numeroEndereco;
        this.cep = cep;
        this.descricao = descricao;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String[] getComentario() {
        return comentario;
    }

    public void setComentario(String[] comentario) {
        this.comentario = comentario;
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

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.email);
        hash = 11 * hash + Objects.hashCode(this.profissao);
        hash = 11 * hash + this.sexo;
        hash = 11 * hash + Objects.hashCode(this.imagem);
        hash = 11 * hash + Arrays.deepHashCode(this.comentario);
        hash = 11 * hash + Objects.hashCode(this.rua);
        hash = 11 * hash + Objects.hashCode(this.cidade);
        hash = 11 * hash + Objects.hashCode(this.estado);
        hash = 11 * hash + this.numeroEndereco;
        hash = 11 * hash + Objects.hashCode(this.cep);
        hash = 11 * hash + Objects.hashCode(this.descricao);
        hash = 11 * hash + Objects.hashCode(this.telefone);
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
        final Usuario other = (Usuario) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.numeroEndereco != other.numeroEndereco) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.profissao, other.profissao)) {
            return false;
        }
        if (!Objects.equals(this.imagem, other.imagem)) {
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
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Arrays.deepEquals(this.comentario, other.comentario)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
