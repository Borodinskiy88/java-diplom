package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchema;
import ru.netology.graphics.image.TextColorSchemas;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverters;
import ru.netology.graphics.server.GServer;

import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverters(); // Создайте тут объект вашего класса конвертера
        //было null изначально

//        GServer server = new GServer(converter); // Создаём объект сервера
//        server.start(); // Запускаем

        //todo Как вызвать метод???
        //Вызвал))
        //Тест выбора символа
        TextColorSchemas schemas = new TextColorSchemas();
        System.out.println(schemas.convert(245));
        System.out.println(schemas.convert(215));
        System.out.println(schemas.convert(185));
        System.out.println(schemas.convert(155));
        System.out.println(schemas.convert(125));
        System.out.println(schemas.convert(65));
        System.out.println(schemas.convert(35));
        System.out.println(schemas.convert(5));



//      //   Или то же, но с выводом на экран:
        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }
}
