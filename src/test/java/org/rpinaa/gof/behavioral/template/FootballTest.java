package org.rpinaa.gof.behavioral.template;

import org.junit.Test;

public class FootballTest {

    @Test
    public void play_afterInvokingPlayMethod_shouldReturnPrintInColsoleAboutTheFinishedGame() {

        Game game = new Cricket();

        game.play();

        System.out.println();

        game = new Football();

        game.play();
    }
}
