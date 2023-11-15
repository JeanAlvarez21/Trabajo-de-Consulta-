 

val a = 3
val b = 5
def f(x: Double): Double = -x * x + 8 * x - 12
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f)
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(7.33, integracion(a,b,f))
//2//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
val a = 0
val b = 2
def f(x: Double): Double = 3 * Math.pow(x,2)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f)
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(8, integracion(a,b,f))
//3//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
val a = -1
val b = 1
def f(x: Double): Double = x + (2 * Math.pow(x,2)) - (Math.pow(x,3)) + (5 * Math.pow(x,4))
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f)  // Retorna: 4.666666666666667
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(3.333, integracion(a,b,f))  //Retorna: 1.3336666666666668
//4//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
val a = 1
val b = 2
def f(x: Double): Double = (2 * x + 1)/(Math.pow(x,2) + x)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f)  // Retorna: 1.0999999999999999
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(1.09861, integracion(a,b,f))  //Retorna: 0.0013899999999997803
//5//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
val a = 0
val b = 1
def f(x: Double): Double = Math.pow(2.71828,x)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f)  // Retorna: 1.7188604774611995
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(1.71828, integracion(a,b,f))  // Retorna: 5.804774611994912E-4
//6//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
val a = 2
val b = 3
def f(x: Double): Double = 1/Math.sqrt(x-1)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f)  // Retorna: 0.8288488508162422
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(0.828427, integracion(a,b,f))  // Retorna: 4.2185081624213083E-4
//7//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
val a = 0
val b = 1
def f(x: Double): Double = 1/(1 + Math.pow(x,2))
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f)   // Retorna: 0.7833333333333333
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(0.785398, integracion(a,b,f))  // Retorna: 0.0020646666666667146

