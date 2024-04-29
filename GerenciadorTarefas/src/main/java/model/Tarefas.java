package model;

import java.time.LocalDate;

public class Tarefas {

    private int idTarefa;

    private String nomeTarefa;

    private String descricaoTarefa;

    private LocalDate dataTarefa;

    private byte[] imagemTarefa;

    private Usuarios usuario;

    public Tarefas(int idTarefa, String nomeTarefa, String descricaoTarefa, LocalDate dataTarefa, byte[] imagemTarefa, Usuarios usuario) {
        this.idTarefa = idTarefa;
        this.nomeTarefa = nomeTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.dataTarefa = dataTarefa;
        this.imagemTarefa = imagemTarefa;
        this.usuario = usuario;
    }

    public Tarefas() {
        idTarefa = 0;
        nomeTarefa = new String();
        descricaoTarefa = new String();
        usuario = null;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public LocalDate getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(LocalDate dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    public byte[] getImagemTarefa() {
        return imagemTarefa;
    }

    public void setImagemTarefa(byte[] imagemTarefa) {
        this.imagemTarefa = imagemTarefa;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
