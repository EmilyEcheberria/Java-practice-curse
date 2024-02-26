
package Modelo;

import java.util.Date;

public class DirectordeConstruccionHospital {
    IConstructorHospital hospital;
    public void  construir(String name,
                           Direccion dire,
                           int pisos,
                           int [] telefono,
                           Date fechaInicioActividad,
                           int cdoPostal,
                           Cuarto [] consultorios,
                           Recepcion [] recepciones,
                           Ascensor[] ascensor){

    }

    public DirectordeConstruccionHospital(IConstructorHospital hospital) {

        this.hospital = hospital;
    }

}