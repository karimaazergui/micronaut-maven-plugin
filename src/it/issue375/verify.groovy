File log = new File(basedir, 'build.log')
assert log.exists()
assert log.text.contains("BUILD SUCCESS")
assert log.text.contains("Tests run: 1, Failures: 0, Errors: 0, Skipped: 0")