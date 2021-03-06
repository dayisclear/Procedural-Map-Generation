/*
 *  Copyright (C) 2016 Marccspro
 *
 *     This file is part of "Procedural Map Generation".
 *
 *         "Procedural Map Generation" is free software: you can redistribute it and/or modify
 *         it under the terms of the GNU General Public License as published by
 *         the Free Software Foundation, either version 3 of the License, or
 *         (at your option) any later version.
 *
 *         "Procedural Map Generation" is distributed in the hope that it will be useful,
 *         but WITHOUT ANY WARRANTY; without even the implied warranty of
 *         MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *         GNU General Public License for more details.
 *
 *         You should have received a copy of the GNU General Public License
 *         along with "Procedural Map Generation".  If not, see http://www.gnu.org/licenses/.
 */

package fr.veridiangames.engine.lights;

import fr.veridiangames.engine.maths.Mat4;
import fr.veridiangames.engine.rendering.Shader;
import fr.veridiangames.engine.utils.Color4f;
import fr.veridiangames.main.rendering.MainRenderer;

/**
 * Created by Marc on 28/05/2016.
 */
public class AmbientLight extends Light
{
    public AmbientLight(Color4f color, float intensity)
    {
        super(Shader.AMBIANT_LIGHT, color, intensity);
    }

    public void bind(MainRenderer renderer, Mat4 projectionMatrix, Mat4 modelViewMatrix)
    {
        super.bind(renderer, projectionMatrix, modelViewMatrix);
        shader.setColor4f(shader.getUniform("light.color"), color);
        shader.setFloat(shader.getUniform("light.intensity"), intensity);
    }
}
