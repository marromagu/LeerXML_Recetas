/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModificarCopiar;

/**
 *
 * @author mario
 */
public class Receta {

    private String titulo;
    private String cantidad;
    private String ingrediente;
    private String procedimineto;
    private String tiempo;

    public Receta(String titulo, String cantidad, String ingrediente, String procedimineto, String tiempo) {
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.ingrediente = ingrediente;
        this.procedimineto = procedimineto;
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getProcedimineto() {
        return procedimineto;
    }

    public void setProcedimineto(String procedimineto) {
        this.procedimineto = procedimineto;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<titulo>").append(titulo).append("</titulo>");
        sb.append("<ingredientes>");
        sb.append("<ingrediente cantidad=\"").append(cantidad).append("\">").append(ingrediente).append("</ingrediente>");
        sb.append("</ingredientes>");
        sb.append("<procedimiento>").append(procedimineto).append("</procedimiento>");
        sb.append("<tiempo>").append(tiempo).append("</tiempo>");
        return sb.toString();
    }
}
