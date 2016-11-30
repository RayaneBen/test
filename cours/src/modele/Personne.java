package modele;

public class Personne {
 private String nom;
 private double taille;
 private double poids;
 private String couleur_Oeil;
 private String Genre;
 
public Personne() {
	super();
	
}
public Personne(String nom, double taille, double poids, String couleur_Oeil, String genre) {
	super();
	this.nom = nom;
	this.taille = taille;
	this.poids = poids;
	this.couleur_Oeil = couleur_Oeil;
	Genre = genre;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getTaille() {
	return taille;
}
public void setTaille(double taille) {
	this.taille = taille;
}
public double getPoids() {
	return poids;
}
public void setPoids(double poids) {
	this.poids = poids;
}
public String getCouleur_Oeil() {
	return couleur_Oeil;
}
public void setCouleur_Oeil(String couleur_Oeil) {
	this.couleur_Oeil = couleur_Oeil;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
@Override
public String toString() {
	return "Personne [nom=" + nom + ", taille=" + taille + ", poids=" + poids + ", couleur_Oeil=" + couleur_Oeil
			+ ", Genre=" + Genre + "]";
}
 
 
}
