package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sinerji.gabriel.exception.ExplosionException;
import sinerji.gabriel.model.Field;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {

    private Field field;

    @BeforeEach
    void startField(){
        field = new Field(3, 3);
    }


    @Test
    void testeToNextReal(){
        Field toNext = new Field(3, 2);
        boolean result = field.addToNext(toNext);
        assertTrue(result);
    }

    @Test
    void testeToNextRealRight(){
        Field toNext = new Field(3, 4);
        boolean result = field.addToNext(toNext);
        assertTrue(result);
    }

    @Test
    void testeToNextRealTop(){
        Field toNext= new Field(2, 3);
        boolean result = field.addToNext(toNext);
        assertTrue(result);
    }

    @Test
    void testeToNextRealBotton(){
        Field toNext= new Field(4, 3);
        boolean result = field.addToNext(toNext);
        assertTrue(result);
    }


    @Test
    void testeNoNext(){
        Field toNext = new Field(1, 1);
        boolean result = field.addToNext(toNext);
        assertFalse(result);
    }

    void testeSwitchMarked(){
        field.switchMarker();
        assertFalse(field.isMarked);
    }
    void testeSwitchMarkedTwoTimes(){
        field.switchMarker();
        field.switchMarker();
        assertFalse(field.isMarked);
    }

    @Test
    void testeOpenNoBombNoMarked(){
        assertTrue(field.open());
    }

    @Test
    void testeOpenNoBombMarked(){
        field.switchMarker();
        assertFalse(field.open());
    }

    @Test
    void testeOpenBombMarked(){
        field.switchMarker();
        field.setBomb();
        assertFalse(field.open());
    }

    @Test
    void testeOpenBombNoMarked(){
        field.setBomb();

        assertThrows(ExplosionException.class, () -> {
            field.open();
        });
    }


    //"Next" nesse caso seriam vizinhos
    //Então esses métodos estão testando a abertura de campos
    //caso hajam vizinhos.
    @Test
    void testeOpenWithNexts(){
        Field field11 = new Field(1, 1);
        Field field22 = new Field(2,2);


        field22.addToNext(field11);
        field.addToNext(field22);

        field.open();

        assertTrue(field22.isOpen() && field11.isOpen());
    }

    @Test
    void testeOpenWithNexts2(){
        Field field11 = new Field(1, 1);
        Field field12 = new Field(1,1);
        field12.setBomb();

        Field field22 = new Field(2,2);
        field22.addToNext(field11);
        field22.addToNext(field12);

        field.addToNext(field22);
        field.open();

        assertTrue(field22.isOpen() && field11.isClosed());
    }


}
