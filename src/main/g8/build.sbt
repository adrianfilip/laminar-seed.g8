
name := "laminar-hello"

version := "0.1"

val laminarVersion    = "0.13.1"
val animusVersion     = "0.1.9"

scalaVersion := "3.0.1"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "com.raquo"            %%% "laminar"         % laminarVersion,
      "io.github.cquiroz"    %%% "scala-java-time" % "2.3.0",
      "io.laminext"          %%% "websocket"       % "0.13.6"
    )
  )


