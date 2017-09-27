package com.ridelnova.todoaquiapp.dto;

/**
 * @author Jovani Aarzate
 *
 */
public class CategoriasDto {

	private Integer idCategoria;
	private String nombre;
	private String descripcion;
	private boolean status;
	private Integer idImagen;

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}

	@Override
	public String toString() {
		return "CategoriasDto [idCategoria=" + idCategoria + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", status=" + status + ", idImagen=" + idImagen + "]";
	}

}
