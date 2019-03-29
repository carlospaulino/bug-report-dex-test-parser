package tests

import com.linkedin.dex.parser.DexParser
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

const val JAVA7_TEST_APK = "../app-java7/build/outputs/apk/androidTest/debug/app-java7-debug-androidTest.apk"
const val JAVA8_TEST_APK = "../app-java8/build/outputs/apk/androidTest/debug/app-java8-debug-androidTest.apk"

/**
 * Make sure to assemble the tests apks before running these tests
 * ./gradlew assembleAndroidTest
 */
class DexTestParserTest {

    @Test
    fun `java8 apk`() {
        val testMethods = DexParser.findTestMethods(JAVA8_TEST_APK)
        assertThat(testMethods).hasSize(1)
    }

    // This test will fail
    @Test
    fun `java7 apk`() {
        val testMethods = DexParser.findTestMethods(JAVA7_TEST_APK)
        assertThat(testMethods).hasSize(1)
    }
}
