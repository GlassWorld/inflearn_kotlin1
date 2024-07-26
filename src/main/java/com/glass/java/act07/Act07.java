package com.glass.java.act07;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Act07 {

    public static void main(String[] args) throws IOException {
    }

    private Integer parseIntOrThrow2(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
