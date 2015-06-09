package com.pathshala.gameoflife;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class GridTest {

    @Test
    public void ShouldBeAbleToMakeAlivingCellDead() {
        Grid infiniteGrid = new Grid();
        infiniteGrid.addLivingCell(4, 5);

        infiniteGrid.killCell(4, 5);
        boolean expected = false;
        boolean actual = infiniteGrid.isAlive(4, 5);

        assertThat(expected, is(actual));
    }

    @Test
    public void ShouldBeAbleToAddALivingCell() {
        Grid infiniteGrid = new Grid();
        infiniteGrid.addLivingCell(4, 5);

        boolean expected = true;
        boolean actual = infiniteGrid.isAlive(4, 5);

        assertThat(expected, is(actual));

    }

}