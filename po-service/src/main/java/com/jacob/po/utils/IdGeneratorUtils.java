package com.jacob.po.utils;

import java.util.Random;

/**
 * 🏷️ Utility class for generating various types of numeric ID tags
 * used within the PixOrganizer application.
 * <p>
 * This class uses a single, shared {@code Random} instance for generating
 * random numbers efficiently across different ID ranges.
 * </p>
 *
 * @author Kotohiko
 * @version 1.0
 * @apiNote PixOrganizer ID generator
 * @since 11/21/2025 12:46 AM
 **/
public class IdGeneratorUtils {

    /**
     * A single, shared instance of {@code Random} to minimize object creation overhead.
     * <p>
     * Note: For high-concurrency environments, consider replacing this with
     * {@code java.util.concurrent.ThreadLocalRandom}.
     * </p>
     */
    private static final Random RANDOM = new Random();

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private IdGeneratorUtils() {
    }

    /**
     * Generates a random numeric ID for an "IP Tag".
     * The ID is guaranteed to be within the range [1, 1000], inclusive.
     *
     * @return A {@code String} representation of a random integer between 1 and 1000.
     */
    public static String getIpTagId() {
        int randomNumber = RANDOM.nextInt(1000) + 1;
        return String.valueOf(randomNumber);
    }

    /**
     * Generates a random numeric ID for a "Char Tag".
     * The ID is guaranteed to be within the range [1001, 9999], inclusive.
     *
     * @return A {@code String} representation of a random integer between 1001 and 9999.
     */
    public static String getCharTagId() {
        int min = 1001;
        int max = 9999;
        int randomNumber = RANDOM.nextInt(max - min + 1) + min;
        return String.valueOf(randomNumber);
    }

    /**
     * Generates a random numeric ID for a "General Tag".
     * The ID is guaranteed to be within the range [10000, 99999], inclusive.
     *
     * @return A {@code String} representation of a random integer between 10000 and 99999.
     */
    public static String getGeneralTagId() {
        int min = 10000;
        int max = 99999;
        int randomNumber = RANDOM.nextInt(max - min + 1) + min;
        return String.valueOf(randomNumber);
    }
}