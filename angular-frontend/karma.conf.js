// Karma configuration file, see link for more information
// https://karma-runner.github.io/1.0/config/configuration-file.html


module.exports = function (config) {
  config.set({
    basePath: "",
    frameworks: ["jasmine", "@angular-devkit/build-angular"],
    plugins: [
      require("karma-jasmine"),
      require("karma-chrome-launcher"),
      require("karma-jasmine-html-reporter"),
      require("karma-coverage-istanbul-reporter"),
      require("karma-junit-reporter"),
      require("@angular-devkit/build-angular/plugins/karma"),
    ],
    reporters: ["junit"],
    junitReporter: {
      outputDir: "karma-results",
      outputFile: "karma-results.xml",
    },
    angularCli: {
      environment: "dev",
    },
    port: 9876,
    logLevel: config.LOG_INFO,
    browsers: ["HeadlessChrome"],
    customLaunchers: {
      HeadlessChrome: {
        base: "ChromeHeadless",
        flags: [
          "--no-sandbox",
          "--proxy-bypass-list=*",
          "--proxy-server='http://<my org proxy server>:8080'",
        ],
      },
    },
    autoWatch: false,
    singleRun: true,
  });
};
