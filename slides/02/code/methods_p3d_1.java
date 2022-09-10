class Point3D {   // dichiarazione classe
  double x;      // 3 campi
  double y;
  double z;
  void build(double a,double b,double c){ // build
    this.x = a; this.y = b; this.z = c;
  }
  double getModuloQuadro(){                    // getModuloQuadro
    return this.x * this.x + this.y * this.y + this.z * this.z;
  }
  boolean equal(Point3D q){		// equal
    return this.x == q.x && this.y == q.y && this.z == q.z;    
  }
}
..
// codice cliente
Point3D p1 = new Point3D();      // creo un punto p1
p1.build(10.0,20.0,30.0);        // ne imposto i valori
Point3D p2 = new Point3D();      // creo un punto p2
p2.build(10.0,20.0,31.0);        // ne imposto i valori
double m2 = p1.getModuloQuadro();// ottengo il modulo quadr. di p1
boolean b = p1.equal(p2);        // chiedo a p1 se è uguale a p2
