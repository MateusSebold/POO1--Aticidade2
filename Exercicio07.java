
public class Exercicio07 {
private double Z;
private double R;
private double Rendimento;

public void setZ(double Z) {
	if(Z>0)
		this.Z = Z;
}
public double  getZ() {
	return Z;
}

public void setR(double R) {
	if(R>0)
		this.R = R ;
}
public double getR() {
	return R;
}

public void setRendimento(double Rendimento) {
	if(Rendimento>0)
		this.Rendimento = Rendimento ;
}
public double getRendimento() {
	return Rendimento;
}

public double G() {
	return java.lang.Math.sqrt((Z*Z)+(R*R));
}

public double area() {
 return (3.14*R)*(R+(java.lang.Math.sqrt((Z*Z)+(R*R))));
}

public double arealado() {
	return 3.14*R*(java.lang.Math.sqrt((Z*Z)+(R*R)));

	

}
public double areatotal() { 
	return (3.14*R)*(R+(java.lang.Math.sqrt((Z*Z)+(R*R))))+(3.14*R*(java.lang.Math.sqrt((Z*Z)+(R*R))));
}

public double litros () {
	return ((3.14*R)*(R+(java.lang.Math.sqrt((Z*Z)+(R*R))))+(3.14*R*(java.lang.Math.sqrt((Z*Z)+(R*R))))/Rendimento);
}
public double latas() {
	return (((3.14*R)*(R+(java.lang.Math.sqrt((Z*Z)+(R*R))))+(3.14*R*(java.lang.Math.sqrt((Z*Z)+(R*R))))/Rendimento)/18);
}
public double valor1() {
	return ((((3.14*R)*(R+(java.lang.Math.sqrt((Z*Z)+(R*R))))+(3.14*R*(java.lang.Math.sqrt((Z*Z)+(R*R))))/Rendimento)/18)*238.90);
}

public double valor2() {
	return ((((3.14*R)*(R+(java.lang.Math.sqrt((Z*Z)+(R*R))))+(3.14*R*(java.lang.Math.sqrt((Z*Z)+(R*R))))/Rendimento)/18)*467.98);
}

public double valor3() {
	return ((((3.14*R)*(R+(java.lang.Math.sqrt((Z*Z)+(R*R))))+(3.14*R*(java.lang.Math.sqrt((Z*Z)+(R*R))))/Rendimento)/18)*758.34);
}
}



