package br.com.fiap.educalab.models;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class AplicativoInstalado {

    private String nome;
    private String packageName;
    private Drawable icon;

    public AplicativoInstalado() {
        super();
    }

    public AplicativoInstalado(String nome, String packageName, Drawable icon) {
        this();

        this.nome = nome;
        this.packageName = packageName;
        this.icon = icon;
    }

    public Drawable getIcon(){
        return icon;
    }

    public void setIcon(Drawable icon){
        this.icon = icon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
