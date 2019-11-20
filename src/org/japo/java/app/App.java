/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

//import org.japo.java.main.Main;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final String MSG_USR = "Introduce un número ..:";
    public static final String MSG_OUT = "Número introducido ...: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";

    public static final void launchApp() {
        //Cabecera
        System.out.println("INTRODUCCIÓN ENTERO");
        System.out.println("===================");

        //Dato consola
        int n = (int) obtener(MSG_USR, MSG_OUT);

        //Mostrar dato
    }

    public static final double obtener(String msgUsr, String msgErr) {
        //Numero devolver
        double numero = 0;

        //Proceso entrada
        boolean errorOk = true;
        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                errorOk = false;

            } catch (Exception e) {
                //Mensaje error
                System.out.println(MSG_ERR);

                //Separador
                System.out.println("---");
            } finally {
                SCN.nextLine();
            }
            

        } while (errorOk);
        System.out.println("---");
        System.out.println(MSG_OUT + (int) numero);
        return numero;

    }
}
