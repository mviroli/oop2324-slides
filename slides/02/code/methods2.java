A obj = new A();
int v = obj.i;               // vale 0
obj.add(10);                 // modifico obj
obj.add(20);                 // modifico obj
int v2 = obj.i;              // vale 30
int v3 = obj.getValue();     // vale 30
