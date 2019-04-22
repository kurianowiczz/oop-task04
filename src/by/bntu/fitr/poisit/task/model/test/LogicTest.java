import by.bntu.fitr.poisit.task.model.entity.Matrix;
import by.bntu.fitr.poisit.task.model.logic.Logic;
import org.junit.Assert;

import static org.junit.Assert.*;

public class LogicTest {

    @org.junit.Test
    public void normalSort() {
        Matrix testObj = new Matrix(new int[][]{
                {4, 5},
                {1, 2} });

        Matrix expectedObj = new Matrix(new int[][]{
                {5, 4},
                {2, 1} });

        Logic.sort(testObj);
        Assert.assertEquals(expectedObj, testObj);
    }

    @org.junit.Test
    public void emptySort() {
        Matrix testObj = new Matrix(new int[][]
                { {} });
        Matrix expectedObj = new Matrix(new int[][]
                { {} });
        Logic.sort(testObj);
        Assert.assertEquals(expectedObj, testObj);
    }
}