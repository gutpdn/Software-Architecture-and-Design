package com.solid.lsp;

public class Square{

    private Rectangle rec;
    Square(int side) {

        this.rec = new Rectangle(side, side);
    }

    public void setSide(int side) {
        this.rec.setWidth(side);
        this.rec.setHeight(side);
    }

    public  int getSide() {
        return this.rec.getHeight();
    }

    public int getArea(){
        return this.rec.getArea();
    }
}
