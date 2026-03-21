# Spotlight watch face for Wear OS

This is an implementation of the watch face concept by [Konstantin Pulyarkin](http://hop-picker.tumblr.com/post/51065757240) for Wear OS using [Watch Face Format 2](https://developer.android.com/training/wearables/wff):

![Watch](images/original_idea.gif)

The watch face displays an animated "spotlight" zoom effect: a magnified section of a virtual clock dial, with the focal point following the hour hand position.

## Supported Devices

This watch face targets **Watch Face Format 2** (WFF 2) and requires **Wear OS 5** (API 34+). Compatible devices include:

- **Google Pixel Watch** (original, with Wear OS 5 update)
- **Google Pixel Watch 2**
- **Google Pixel Watch 3**
- **Samsung Galaxy Watch 4/5/6/7** (with Wear OS 5 update)
- **Samsung Galaxy Watch FE**
- Other Wear OS 5+ devices

## Customization

The watch face supports customization through the watch face editor:

- **Hour Line Color**: Red, Blue, Green, White, Yellow, Cyan, Magenta, Orange
- **Hash Mark Color**: White, Light Gray, Blue, Green, Yellow, Red
- **Numeral Color**: White, Light Gray, Yellow, Cyan, Red
- **Numeral Style**: Arabic or Roman numerals
- **Preset Flavors**: Classic, Blue Ice, Matrix, Sunset

## Building

1. Open the project in Android Studio
2. Build the APK: `./gradlew assembleDebug`
3. Install on a connected Wear OS 5 device: `adb install app/build/outputs/apk/debug/app-debug.apk`

## History

This project was originally a Garmin Connect IQ watch face (Monkey C), ported to Wear OS using the Watch Face Format 2 declarative XML format. The original Garmin version was inspired by [Spotlight](https://play.google.com/store/apps/details?id=com.maize.spotlight) by Maize.

![animated watch face](images/animated_watch_face_small.gif)
