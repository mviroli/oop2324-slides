class A {
  int i;
  void add(int a){
    this.i = this.i + a;    // this.i: il "mio" campo i
  }
  int getValue(){
    return this.i;
  }
  int get(){		// Un alias per getValue
    return this.getValue();
  }
}
