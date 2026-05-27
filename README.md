# Three Layered World

> Three independent overworlds stacked in one dimension. Y 0-60: subterranean cave world. Y 80-160: normal surface world. Y 180-260: floating sky islands. Each layer is separated by a void gap. Climb up or dig down to enter a completely different world.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![NeoForge 1.21.1](https://img.shields.io/badge/NeoForge-1.21.1-orange.svg)](https://neoforged.net)
[![Depends on Isekai API](https://img.shields.io/badge/Depends-Isekai%20API-9333ea)](https://github.com/KURONAMI333/isekai-api)

---

## Concept

The most ambitious consumer in the set. Each Y band is its own worldshape with its own ore distribution, structure placement rules, and mob spawn rules. Spawn in the surface layer at Y 80, then choose: descend to the cave world below or ascend to the sky islands above. Each layer feels like an entirely different dimension.

This is the **capstone demo** for Isekai API's multi-layer worldshape machinery: if Three Layered World works, the library can produce arbitrary stacks of arbitrary worldshapes.

## How it works

Three Layered World is built on **[Isekai API](https://github.com/KURONAMI333/isekai-api)**, a neutral universal worldgen library.

It exercises `declareLayeredWorldshape` with three `LayeredDescriptor`s and `TransitionRule.Gap` between them. Each layer's density is itself a composition of Isekai primitives (e.g., the top layer uses the same `mask` + `distance` pattern as Sky World, the bottom layer uses `SurfaceAnchor.SolidCeiling` like Hollow Earth's inner layer).

## Status

**v0.1**: skeleton. Three-layer declaration + per-layer density composition land with Isekai API v0.2.

## Dependencies

- NeoForge 1.21.1
- [Isekai API](https://github.com/KURONAMI333/isekai-api) (required)

## License

[MIT License](LICENSE) — modpack inclusion welcome, no credit required.

## Credits

- Author: KURONAMI
