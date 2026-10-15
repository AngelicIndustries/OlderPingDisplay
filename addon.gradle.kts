import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication

extensions.configure<PublishingExtension> {
    publications.withType<MavenPublication>().configureEach {
        pom {
            name.set("Older Ping Display")
            description.set("Displays numeric player ping in Minecraft 1.7.10, maintained by Angelic Industries.")
            url.set("https://github.com/AngelicIndustries/OlderPingDisplay")
            organization {
                name.set("Angelic Industries")
                url.set("https://angelic.industries/")
            }
            scm {
                url.set("https://github.com/AngelicIndustries/OlderPingDisplay")
                connection.set("scm:git:https://github.com/AngelicIndustries/OlderPingDisplay.git")
                developerConnection.set("scm:git:ssh://git@github.com/AngelicIndustries/OlderPingDisplay.git")
            }
            licenses {
                license {
                    name.set("GNU Lesser General Public License, version 3")
                    url.set("https://www.gnu.org/licenses/lgpl-3.0.html")
                    distribution.set("repo")
                }
            }
        }
    }
}
