This repository just contains a demo that reproduces a bug in `dex-test-parser`. 

In some circumstances `DexParser.findTestMethods()` is throwing a `DexException` when parsing a test apk compiled with java 7 compatibility. 

To reproduce the bug just run `./gradlew reproduceBug`
