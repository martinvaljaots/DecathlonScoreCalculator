package main.decathlon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Smarta on 20.08.2017.
 */
public class InfoReaderTest {
    @Test
    public void readFileTest() throws Exception {
        InfoReader ir = new InfoReader();
        List<Athlete> at = new ArrayList<>();

        at = ir.readFile("/decathlon/read_file_test.txt");

        assertEquals("Jaan Kask", at.get(0).getName());
        assertEquals("Mari Kaks", at.get(1).getName());
        assertEquals(10.2, at.get(0).getOneHundredResult(), 0);
        assertEquals(9.2, at.get(1).getOneHundredResult(), 0);
        assertEquals(790, at.get(0).getLongJumpResult());
        assertEquals(650, at.get(1).getLongJumpResult());
        assertEquals(18.75, at.get(0).getShotPutResult(), 0);
        assertEquals(17.55, at.get(1).getShotPutResult(), 0);
        assertEquals(217, at.get(0).getHighJumpResult());
        assertEquals(206, at.get(1).getHighJumpResult());
        assertEquals(46.00, at.get(0).getFourHundredResult(), 0);
        assertEquals(45.40, at.get(1).getFourHundredResult(), 0);
        assertEquals(13.70, at.get(0).getOneTenHurdlesResult(), 0);
        assertEquals(12.10, at.get(1).getOneTenHurdlesResult(), 0);
        assertEquals(57.50, at.get(0).getDiscusThrowResult(), 0);
        assertEquals(55.40, at.get(1).getDiscusThrowResult(), 0);
        assertEquals(478, at.get(0).getPoleVaultResult());
        assertEquals(464, at.get(1).getPoleVaultResult());
        assertEquals(81.00, at.get(0).getJavelinThrowResult(), 0);
        assertEquals(80.59, at.get(1).getJavelinThrowResult(), 0);
        assertEquals(220.0, at.get(0).getFifteenHundredResult(), 0);
        assertEquals(210.1, at.get(1).getFifteenHundredResult(), 0);


    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void readFileArrayIndexOutOfBoundsTest() throws Exception {
        InfoReader ir = new InfoReader();
        List<Athlete> at = new ArrayList<>();
        at = ir.readFile("/decathlon/array_index_out_of_bounds_test.txt");
    }

    @Test (expected = NumberFormatException.class)
    public void readFileNumberFormatExceptionTest() throws Exception {
        InfoReader ir = new InfoReader();
        ir.readFile("/decathlon/number_format_exception.test.txt");
    }
}