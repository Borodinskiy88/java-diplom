package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchema;
import ru.netology.graphics.image.TextColorSchemas;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = null; // Создайте тут объект вашего класса конвертера

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        //todo Как вызвать метод???
        //Вызвал))
        TextColorSchemas schemas = new TextColorSchemas();
        schemas.convert(245);


      //   Или то же, но с выводом на экран:
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}
