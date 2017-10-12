println("Groovy processing payload '" + payload + "'");
if (payload.grep('a')) {
    return "foo"
}
else {
    return "bar"
}
