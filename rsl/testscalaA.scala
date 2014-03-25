
val proj = RSWorkspace.project("Ex0")
val cls = proj.pkg("p").classes.select(By.Name("MyGameP")).first

val fs = cls.fields.select(By.modifier(With.or("protected", "private")))

fs.foreach(f => {
	if(!f.name.startsWith("_")) {
		f.rename("_" + f.name)
	}
})