package ru.netology.graphics.image;

public class TextColorSchemas implements TextColorSchema{

    //todo Подумать как улучшить

    @Override
    public char convert(int color) {
        if (color >= 0 && color < 32 ) {
            return '#';
        } else if (color >= 32 && color < 64) {
            return '$';
        } else if (color >= 64 && color < 96) {
            return '@';
        } else if (color >= 96 && color < 128) {
            return '%';
        } else if (color >= 128 && color < 160) {
            return '*';
        } else if (color >= 160 && color < 192) {
            return '+';
        } else if (color >= 192 && color < 224) {
            return '-';
        } else if (color >= 224 && color < 256) {
            return '.';
//            return '`';  варианты последнего символа
//            return '/';
        } else
        return 0;
    }
}
