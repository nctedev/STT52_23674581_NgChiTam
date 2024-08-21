/**
 * @description:
 * @author: Tam, Nguyen Chi Tam
 * @version: 1.0
 * @created: 8/21/2024
 */

package edu.iuh.fit.exer2;

public class Rectangle {
        private double length;
        private double width;

        public Rectangle() {
            this.width = 1.0;
            this.length = 1.0;
        }

        /**
         *Constructor with parameters
         * @param w The width of the rectangle
         * @param l The length of the rectangle
         * @throws IllegalArgumentException if w or l is less than 0
         */

    public Rectangle(double w, double l) {
            if(w < 0 || l < 0)
                throw new IllegalArgumentException("Length and Width must be greater than 0");
            this.width = w;
            this.length = l;
        }

        public double getArea() {
            return this.width * this.length;
        }

        public double getPerimeter() {
                return 2 * (this.width + this.length);
        }

        public double getLength() {
                return this.length;
        }

        public double getWidth() {
                return this.width;
        }

        /**
         * Set the length of the rectangle
         * @param length The length of the rectangle
         * @throws IllegalArgumentException if length is less than 0
         */

        public void setLength(double length) {
                if(length < 0)
                    throw new IllegalArgumentException("Length must be greater than 0");
                this.length = length;
        }

        /**
         * Set the width of the rectangle
         * @param width The width of the rectangle
         * @throws IllegalArgumentException if width is less than 0
         */

        public void setWidth(double width) {
                if(width < 0)
                    throw new IllegalArgumentException("Width must be greater than 0");
                this.width = width;
        }

        public String toString() {
            return  "Rectangle{" +
                    "length=" + length +
                    ", width=" + width +
                    '}';
        }
}
