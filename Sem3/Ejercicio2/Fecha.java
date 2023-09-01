import java.util.Scanner;

public class Fecha{
    private Integer dia;
    private Integer mes;
    private Integer año;

    Scanner scanner = new Scanner(System.in);


    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }
    public Fecha(Integer dia, Integer mes, Integer año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();

    }
    public void leer(){
        System.out.println("Ingrese dia (1/31)");
        Integer dia = scanner.nextInt();
        System.out.println("Ingrese mes (1/12)");
        Integer mes = scanner.nextInt();
        System.out.println("Ingrese año (1900/2050)");
        Integer año = scanner.nextInt();
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();

    }

    public Boolean bisiesto(){
        if(año%100 == 0 && año%400 == 0 || año%100 != 0 && año%400 == 0 || año%4 == 0 && año%100 != 0){
            return true;
        } else {
            return false;    
        }
    }
    public Boolean bisiesto(Integer añito){
        if(añito%100 == 0 && añito%400 == 0 || añito%100 != 0 && añito%400 == 0 || añito%4 == 0 && añito%100 != 0){
            return true;
        } else {
            return false;    
        }
    }

    public Integer diaMes(){
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else if (bisiesto() && mes == 2) {
            return 29;
        } else if (bisiesto() == false && mes == 2) {
            return 28;
        } else {
            return 0;
        }
    }
    public Integer diaMes(Integer mesesito){
        if (mesesito == 4 || mesesito == 6 || mesesito == 9 || mesesito == 11) {
            return 30;
        } else if (mesesito == 1 || mesesito == 3 || mesesito == 5 || mesesito == 7 || mesesito == 8 || mesesito == 10 || mesesito == 12) {
            return 31;
        } else if (bisiesto() && mesesito == 2) {
            return 29;
        } else if (bisiesto() == false && mesesito == 2) {
            return 28;
        } else {
            return 0;
        }
    }
    
    private void valida() {
        if (año < 1900 || año > 2050) {
            año = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        int maxDias = diaMes(mes);
        if (dia < 1 || dia > maxDias) {
            dia = 1;
        }
    }

    public Integer getDia(){
        return this.dia;
    }
    public Integer setDia(Integer dia){
        return this.dia = dia;
    }
    public Integer getMes(){
        return this.mes;
    }
    public Integer setMes(Integer mes){
        return this.mes = mes;
    }
    public Integer getAño(){
        return this.año;
    }
    public Integer setAño(Integer año){
        return this.año = año;
    }

    public String corta(){
        return "("+this.dia+"-"+this.mes+"-"+this.año+")";
    }

    public Integer diasTranscurridos(){
        Integer totaldia = 0;
        Integer totalmes = 0;
        Integer totalaño = 0;
    
        totaldia = dia - 1;
        
        if (año == 1900) {
            totalaño = 0;
            
        } else if (año > 1900) {
            for (Integer añoActual = 1901; añoActual <= año; añoActual++) {
                if (bisiesto(añoActual)) {
                    totalaño += 366;
                } else {
                    totalaño += 365;
                }
            }       
        } 
        if (mes == 1) {
            totalmes = 0;
        } else if (mes > 1 && mes < 13) {
            for (int i = 1; i <= mes; i++) {
                totalmes += diaMes(i);
                
            }
        }
       
        return totaldia + totalmes + totalaño;
    }

    public String diaSemana(){
        Integer semaño = 2;
        for (int i = 1900; i <= año; i++) {
            if(bisiesto(i)){
                semaño += 2;
            } else {
                semaño += 1;
            }
        }
        Integer diasmes = diaMes();
        semaño += diasmes + dia; 

        switch (semaño%7) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 0:
                return "Domingo";
        
            default:
                return "Nose :C";
        }
    }
    public String mesTOstring(){
        switch (mes) {
            case 1:
                return "Enero";                
            case 2:
                return "Febrero";                
            case 3:
                return "Marzo";                
            case 4:
                return "Abril";                
            case 5:
                return "Mayo";                
            case 6:
                return "Junio";                
            case 7:
                return "Julio";                
            case 8:
                return "Agosto";                
            case 9:
                return "Septiembre";                
            case 10:
                return "Octuber";                
            case 11:
                return "Noviembre";                
            case 12:
                return "Diciembre";                
        
            default:
                return "Nolose :C";
        }
    }

    public String larga(){
        return "(" + diaSemana() + " " + this.dia + " de " + mesTOstring() + " del " + this.año + ")";
    }

    public String fechaTras(Integer sumDia){
        Integer actualDia = 1;
        Integer actualMes = 1;
        Integer actualAño = 1900;

        Integer restoAño;
        Integer restoDias = 0;
        Integer sumatoria;
        Integer restoMes;
        Integer cantidadAños;
        if(bisiesto(actualAño)){
            restoAño = sumDia%366;
            cantidadAños = sumDia/366;
            if(cantidadAños>0){
                actualAño += cantidadAños;
            }
        } else {
            restoAño = sumDia%365;
            cantidadAños = sumDia/365;
            if(cantidadAños>0){
                actualAño += cantidadAños;
            }
        }
        for (sumatoria = 1; sumatoria <= 12 ; sumatoria++) {

            if(restoAño > restoDias ){
                restoDias += diaMes(sumatoria);
            } else {
                break;
            }
        }
        if (sumatoria == 1){
            actualMes = 1;
        } else {
            actualMes = sumatoria -1;
        }
        restoMes = restoDias - restoAño;
        actualDia = diaMes(sumatoria-1) - restoMes + 1;

        return actualDia + "-" + actualMes + "-" + actualAño;
    }


    public Integer diasEntre(Fecha fecha){
        Integer totaldia = 0;
        Integer totalmes = 0;
        Integer totalaño = 0;

        totaldia = dia - fecha.dia;
        
        if (año == fecha.año) {
            totalaño = 0;
        } else if (año > fecha.año) {
            for (Integer añoActual = fecha.año; añoActual < año; añoActual++) {
                if (bisiesto(añoActual)) {
                    totalaño += 366;
                } else {
                    totalaño += 365;
                }
            }       
        } 
        if (mes == fecha.mes) {
            totalmes = 0;
        } else if (mes > 1 && mes < 13) {
            for (int i = fecha.mes; i < mes; i++) {
                totalmes += diaMes(i);
                
            }
        }
        return totaldia + totalmes + totalaño;
    }

    public void siguiente(){
        if (dia == diaMes()){
            dia = 1;
            mes += 1;
            if (mes == 13) {
                mes=1;
                año+=1;
            }
        } else {
            dia +=1;
        }
    }

    public void anterior(){
        if (dia == 1){
            mes -= 1;
            if (mes == 0) {
                mes=12;
                año-=1;
                dia = diaMes(mes-1);
            }
        } else {
            dia -=1;
        }
    }


    public String fechaFutura(Integer sumDia){
        Integer actualDia = this.dia;
        Integer actualMes = this.mes;
        Integer actualAño = this.año;

        Integer restoAño;
        Integer restoDias = 0;
        Integer sumatoria;
        Integer restoMes;
        Integer cantidadAños;
        if(bisiesto(actualAño)){
            restoAño = sumDia%366;
            cantidadAños = sumDia/366;
            if(cantidadAños>0){
                actualAño += cantidadAños;
            }
        } else {
            restoAño = sumDia%365;
            cantidadAños = sumDia/365;
            if(cantidadAños>0){
                actualAño += cantidadAños;
            }
        }
        for (sumatoria = 1; sumatoria <= 12 ; sumatoria++) {

            if(restoAño > restoDias ){
                restoDias += diaMes(sumatoria);
                // System.out.println(sumatoria);
            } else {
                break;
            }
        }
        if (sumatoria == 1){
            actualMes = 1;
        } else {
            actualMes = sumatoria -1;
        }
        restoMes = restoDias - restoAño;
        actualDia = diaMes(sumatoria-1) - restoMes + 1;

        return actualDia + "-" + actualMes + "-" + actualAño;
    }

    public Fecha copia(){
        return new Fecha(this.dia, this.mes, this.año);
    }

    public static Boolean igualQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.año == fecha2.año){
            return true;
        } else {
            return false;
        }
    }

    public static Boolean menorQue(Fecha fecha1, Fecha fecha2){
        if (fecha1.año <= fecha2.año){
            if (fecha1.mes <= fecha2.mes){
                if (fecha1.dia < fecha2.dia){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static Boolean mayorQue(Fecha fecha1, Fecha fecha2){
        if (fecha1.año >= fecha2.año){
            if (fecha1.mes >= fecha2.mes){
                if (fecha1.dia > fecha2.dia){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "Dia: " + this.dia +
             "\nMes: " + this.mes + 
             "\nAño: " + this.año;
    }
}