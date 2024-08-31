package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void whenFigureAtTheSamePositionAsStartTime() {
        Cell cell = Cell.B8;
        BishopBlack bishopBlack = new BishopBlack(cell);
        assertThat(bishopBlack.position()).isEqualTo(cell);
    }

    @Test
    void whenCopyReturnRightPosition() {
        Cell cell = Cell.A8;
        BishopBlack bishopBlack = new BishopBlack(cell);
        Figure copiedFigure = bishopBlack.copy(Cell.F8);
        assertThat(copiedFigure.position()).isEqualTo(Cell.F8);
    }

    @Test
    void whenWayIsCorrect() {
        Cell cell = Cell.C1;
        BishopBlack bishopBlack = new BishopBlack(cell);
        Cell[] expectedPath = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5)).isEqualTo(expectedPath);
    }
}