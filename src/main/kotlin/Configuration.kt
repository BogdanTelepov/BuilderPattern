import java.awt.Color

data class Configuration(
    val latency: Int,
    val userColor: Color,
    val nickname: String,
    val sensitivity: Int

)


class ConfigurationBuilder() {
    var latency: Int = 300
    var userColor: Color = Color.BLUE
    var sensitivity: Int = 0


    private fun setSensitivity(value: Int): ConfigurationBuilder {
        this.sensitivity = value
        return this
    }

    private fun latency(value: Int): ConfigurationBuilder {
        this.latency = value
        return this
    }

    private fun userColor(value: Color): ConfigurationBuilder {
        this.userColor = value
        return this
    }

    private fun build(): Configuration {
        return Configuration(latency = latency, userColor = userColor, sensitivity = sensitivity, nickname = "User")
    }


    val configuration: Configuration = ConfigurationBuilder()
        .latency(300)
        .setSensitivity(100)
        .userColor(Color.BLACK)
        .build()

}
