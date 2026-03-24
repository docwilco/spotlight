# Spotlight watch face for Wear OS

A modernized, customizable implementation of the [Spotlight](https://play.google.com/store/apps/details?id=com.maize.spotlight) watch face by Maize for Wear OS, built using [Watch Face Format 2](https://developer.android.com/training/wearables/wff). Based on the original concept by [Konstantin Pulyarkin](http://hop-picker.tumblr.com/post/51065757240):

![Watch](images/original_idea.gif)

The watch face displays an animated "spotlight" zoom effect: a magnified section of a virtual clock dial, with the focal point following the hour hand position. This version brings the design to modern Wear OS devices with full customization support through the system watch face editor.

![animated watch face](images/animated_watch_face_small.gif)

## Supported Devices

This watch face targets **Watch Face Format 2** (WFF 2) and requires **Wear OS 5** (API 34+). Compatible devices include:

- **Google Pixel Watch** (original, with Wear OS 5 update)
- **Google Pixel Watch 2**
- **Google Pixel Watch 3**
- **Samsung Galaxy Watch 4/5/6/7** (with Wear OS 5 update)
- **Samsung Galaxy Watch FE**
- Other Wear OS 5+ devices

## Customization

The watch face supports customization through the native Wear OS watch face editor — no companion app needed:

- **Hour Line Color**: Red, Blue, Green, White, Yellow, Cyan, Magenta, Orange
- **Hash Mark Color**: White, Light Gray, Blue, Green, Yellow, Red
- **Numeral Color**: White, Light Gray, Yellow, Cyan, Red
- **Numeral Style**: Arabic or Roman numerals
- **Preset Flavors**: Classic, Blue Ice, Matrix, Sunset

## Building

1. Open the project in Android Studio
2. Build the APK: `./gradlew assembleDebug`
3. The APK will be at `app/build/outputs/apk/debug/app-debug.apk`

## Testing

### On the Wear OS Emulator

1. In Android Studio, open **Tools → Device Manager** and create a new virtual device
2. Select a **Wear OS** hardware profile (e.g. "Wear OS Small Round")
3. Choose a system image with **API 34** or higher (Wear OS 5)
4. Start the emulator
5. Install the watch face:
   ```bash
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```
6. On the emulator, long-press the watch face → tap the **+** button or swipe to browse → select **Spotlight**

### On a Physical Pixel Watch 2

1. On the watch, go to **Settings → System → Developer options** (tap "Build number" 7 times under **Settings → System → About watch** to unlock it)
2. Enable **ADB debugging** and **Debug over Wi-Fi** (or connect via USB if using a debug cable)
3. For Wi-Fi debugging, note the IP address shown, then pair from your computer:
   ```bash
   adb pair <ip>:<pair-port>    # enter the pairing code shown on the watch
   adb connect <ip>:<connect-port>
   ```
4. Install the watch face:
   ```bash
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```
5. On the watch, long-press the current watch face → swipe to browse → select **Spotlight**
6. Tap the pencil/edit icon on the watch face preview to customize colors, numeral style, and presets

## History

This project started as a Garmin Connect IQ watch face written in Monkey C, inspired by the Android watch face [Spotlight](https://play.google.com/store/apps/details?id=com.maize.spotlight) by Maize. It has since been ported to Wear OS using the Watch Face Format 2 declarative XML format, bringing it to modern smartwatches with additional customization options.
