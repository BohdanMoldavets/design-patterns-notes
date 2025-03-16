package org.moldavets.utils;

import org.moldavets.model.shape.Impl.Circle;
import org.moldavets.model.shape.Impl.Rectangle;
import org.moldavets.model.shape.Impl.Square;
import org.moldavets.model.shape.Shape;

public enum ShapeType {
    CIRCLE,
    SQUARE,
    RECTANGLE;

    public static Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
