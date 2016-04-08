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
  private char operacion;
  private int base;

  public Calculadora() {
      this.operacion1 = 0;
      this.operacion2 = 0;
      this.resultado = 0;
      this.operacion = ' ';
  }

  public void setOperacion1(int n){
      this.operacion1 = n;
  }

  public void setNumeroB(int n){
      this.setOperacion2(n);
  }

  public void setResultado(int n){
      this.resultado = n;
  }

  public void setOperacion(char o){
      this.operacion = o;
  }

  public int getOperacion1(){
      return this.operacion1;
  }

  public int getNumeroB(){
      return this.getOperacion2();
  }

  public int getResultado(){
      return this.resultado;
  }

  public char getOperacion(){
      return this.operacion;
  }

  public void suma(){
      this.setResultado(this.getOperacion1() + this.getOperacion2());
  }
  public void resta(){
      this.setResultado(this.getOperacion1() - this.getOperacion2());
  }
  public void multiplicacion(){
      this.setResultado(this.getOperacion1() * this.getOperacion2());
  }
  public void division(){
      this.setResultado(this.getOperacion1() / this.getOperacion2());
  }

  public void establecerNumeroA(String a){
      int n = Integer.parseInt(a, getBase());
      this.setOperacion1(n);
  }
  public void establecerNumeroB(String b){
      int n = Integer.parseInt(b, getBase());
      this.setNumeroB(n);
  }
  public String retornarNumeroA(){
      String cad="";
      switch(getBase()){
      case 2:
          cad = Integer.toBinaryString(getOperacion1());
          break;
      case 8:
          cad = Integer.toOctalString(getOperacion1());
          break;
      case 10:
          cad = String.valueOf(getOperacion1());
          break;
      case 16:
          cad = Integer.toHexString(getOperacion1());
          break;
      }
      return cad;
    
  }
  public String retornarNumeroB(){
      String cad="";
      switch(getBase()){
      case 2:
          cad = Integer.toBinaryString(getOperacion2());
          break;
      case 8:
          cad = Integer.toOctalString(getOperacion2());
          break;
      case 10:
          cad = String.valueOf(getOperacion2());
          break;
      case 16:
          cad = Integer.toHexString(getOperacion2());
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
    public int getOperacion2() {
        return operacion2;
    }

    /**
     * @param operacion2 the operacion2 to set
     */
    public void setOperacion2(int operacion2) {
        this.operacion2 = operacion2;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }
    
}