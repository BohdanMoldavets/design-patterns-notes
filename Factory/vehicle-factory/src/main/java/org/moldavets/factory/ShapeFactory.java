package org.moldavets.factory;

import org.moldavets.model.shape.Shape;
import org.moldavets.utils.ShapeType;

public class ShapeFactory implements Factory<Shape, ShapeType>{
    @Override
    public Shape create(ShapeType value) {
        return ShapeType.getShape(value);
    }
}
