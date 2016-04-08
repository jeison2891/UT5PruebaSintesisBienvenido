/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author 1-DAM-T
 */
public class Calculadora {
  private int operacion1;
  private int operacion2;
  private int resultado;
  private char operador;
  private int base;

  public Calculadora() {
      this.operacion1 = 0;
      this.operacion2 = 0;
      this.resultado = 0;
      this.operador = ' ';
  }

  public void setOperacion1(int n){
      this.operacion1 = n;
  }

  public void setOperacion2(int n){
      this.operacion2(n);
  }

  public void setResultado(int n){
      this.resultado = n;
  }

  public void setOperador(char o){
      this.operador = o;
  }

  public int operacion1(){
      return this.operacion1;
  }

  public int getOperacion2(){
      return this.operacion2();
  }

  public int getResultado(){
      return this.resultado;
  }

  public char getOperador(){
      return this.operador;
  }

  public void suma(){
      this.setResultado(this.operacion1() + this.operacion2());
  }
  public void resta(){
      this.setResultado(this.operacion1() - this.operacion2());
  }
  public void multiplicacion(){
      this.setResultado(this.operacion1() * this.operacion2());
  }
  public void division(){
      this.setResultado(this.operacion1() / this.operacion2());
  }

  public void establecerOperacion1(String a){
      int n = Integer.parseInt(a, getBase());
      this.setOperacion1(n);
  }
  public void establecerNumeroB(String b){
      int n = Integer.parseInt(b, getBase());
      this.setOperacion2(n);
  }
  public String retornarNumeroA(){
      String cad="";
      switch(getBase()){
      case 2:
          cad = Integer.toBinaryString(operacion1());
          break;
      case 8:
          cad = Integer.toOctalString(operacion1());
          break;
      case 10:
          cad = String.valueOf(operacion1());
          break;
      case 16:
          cad = Integer.toHexString(operacion1());
          break;
      }
      return cad;
    
  }
  public String retornarNumeroB(){
      String cad="";
      switch(getBase()){
      case 2:
          cad = Integer.toBinaryString(operacion2());
          break;
      case 8:
          cad = Integer.toOctalString(operacion2());
          break;
      case 10:
          cad = String.valueOf(operacion2());
          break;
      case 16:
          cad = Integer.toHexString(operacion2());
          break;
      }
      return cad;
  }
  public String retornarResultado(){
      String cad="";
      switch(getBase()){
      case 2:
          cad = Integer.toBinaryString(getResultado());
          break;
      case 8:
          cad = Integer.toOctalString(getResultado());
          break;
      case 10:
          cad = String.valueOf(getResultado());
          break;
      case 16:
          cad = Integer.toHexString(getResultado());
          break;
      }
      return cad;
  }

    /**
     * @return the operacion2
     */
    public int operacion2() {
        return operacion2;
    }

   
     
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    private void operacion2(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}