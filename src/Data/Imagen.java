/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import javax.swing.Icon;

/**
 *
 * @author Esteban
 */
public class Imagen {
  private String name;
        private Icon imag;
        public Imagen(String text,Icon icon)
        {
            this.name=text;
            imag=icon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Icon getImag() {
            return imag;
        }

        public void setImag(Icon imag) {
            this.imag = imag;
        }   
}
