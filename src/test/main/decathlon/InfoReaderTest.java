package main.decathlon;

import org.junit.Rule;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.IllegalFormatException;

import static org.junit.Assert.*;

/**
 * Created by Smarta on 20.08.2017.
 */
public class InfoReaderTest {
    @Test
    public void readFileTest() throws Exception {
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void readFileArrayIndexOutOfBoundsTest() throws Exception {
        InfoReader ir = new InfoReader();
        ir.readFile("");
    }

    @Test (expected = IllegalFormatException.class)
    public void readFileIllegalFormatExceptionTest() throws Exception {

    }
}