/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest13.Bai01;

/**
 *
 * @author Lenovo
 */
public class PhanSo {
    private long numerator;
    private long denominator;
    
    public PhanSo(long numerator, long denominator){
        this.numerator = numerator;
        if (denominator == 0){
            throw new IllegalArgumentException("The denominator cannot be 0.");
        }
        this.denominator = denominator;
        rutGon();
    }
    
    private long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    private void rutGon(){
        long ucln = gcd(this.numerator, this.denominator);
        this.numerator /= ucln;
        this.denominator /= ucln;
    }
    
    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
